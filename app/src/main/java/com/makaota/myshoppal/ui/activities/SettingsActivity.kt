package com.makaota.myshoppal.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.makaota.myshoppal.R
import com.makaota.myshoppal.firestore.FirestoreClass
import com.makaota.myshoppal.models.User
import com.makaota.myshoppal.utils.Constants
import com.makaota.myshoppal.utils.GlideLoader
import kotlinx.android.synthetic.main.activity_settings.*

/**
 * Setting screen of the app.
 */
// Replace the AppCompactActivity with BaseActivity.
class SettingsActivity : BaseActivity(), View.OnClickListener {

    private lateinit var mUserDetails: User

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_settings)

        // Call the function to setup action bar.
        // START
        setupActionBar()
        // END

        btn_logout.setOnClickListener(this)
        tv_edit.setOnClickListener(this)
        ll_address.setOnClickListener(this)
    }

    // Override the onResume function and call the getUserDetails function init.
    // START
    override fun onResume() {
        super.onResume()

        getUserDetails()
    }
    // END

    // Create a function to setup action bar.
    // START
    /**
     * A function for actionBar Setup.
     */
    private fun setupActionBar() {

        setSupportActionBar(toolbar_settings_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
        }

        toolbar_settings_activity.setNavigationOnClickListener { onBackPressed() }
    }
    // END

    // Create a function to get the user details from firestore.
    // START
    /**
     * A function to get the user details from firestore.
     */
    private fun getUserDetails() {

        // Show the progress dialog
        showProgressDialog(resources.getString(R.string.please_wait))

        // Call the function of Firestore class to get the user details from firestore which is already created.
        FirestoreClass().getUserDetails(this@SettingsActivity)
    }
    // END

    // Create a function to receive the success result.
    // START
    /**
     * A function to receive the user details and populate it in the UI.
     */
    fun userDetailsSuccess(user: User) {

        mUserDetails = user
        // Set the user details to UI.
        // START
        // Hide the progress dialog
        hideProgressDialog()

        // Load the image using the Glide Loader class.
        GlideLoader(this@SettingsActivity).loadUserPicture(user.image, iv_user_photo)

        tv_name.text = "${user.firstName} ${user.lastName}"
        tv_gender.text = user.gender
        tv_email.text = user.email
        tv_mobile_number.text = "${user.mobile}"
        // END
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {

                // Call the User Profile Activity to add the Edit Profile feature to the app. Pass the user details through intent.
                // START
                R.id.tv_edit -> {
                    val intent = Intent(this@SettingsActivity, UserProfileActivity::class.java)
                    intent.putExtra(Constants.EXTRA_USER_DETAILS, mUserDetails)
                    startActivity(intent)
                }
                // END

                // Add Logout feature when user clicks on logout button.
                // START
                R.id.btn_logout -> {

                    FirebaseAuth.getInstance().signOut()

                    val intent = Intent(this@SettingsActivity, LoginActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)
                    finish()
                }
                // END

                R.id.ll_address ->{
                    val intent = Intent(this@SettingsActivity, AddressListActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
// END