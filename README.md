# Date Developed      
26/03/2022
# Date Modified            : 10/05/2022
# Developer FullName       : Seotsa Abram Makaota
Project Name             : My ShopPal App
Project Purpose          : To learn how to build an e-commerce app for Android using
the Firestore database of Google Firebase
About the app            : It is an adjustable e-commerce application that you can use to create
your own online store or use it as a template to create an e-commerce app for your client.
In this app we are covering such topics as Firebase basics
How to upload and download data to and from an online database
Displaying Images from the Cloud
Creating User Profiles
Uploading and displaying Products Building a Cart System
Selecting images from your phone
Features                 : This app represent 15 feature Activities and 4 feature Fragments
Activities
1. SplashActivity
2. LoginActivity
3. ForgotPasswordActivity
4. UserProfileActivity
5. RegistrationActivity
6. DashboardActivity
7. AddProductActivity
8. ProductDetailsActivity
9. SoldProductDetailsActivity
10. OderDetailsActivity
11. CartListActivity
12. SettingsListActivity
13. AddEditAddressActivity
14. AddressListActivity
15. CheckoutActivity
Fragments
1. DashBoardFragment
2. ProductsFragment
3. OrdersFragment
4. SoldProducts              
Libraries used              : //Firebase
Import the BoM for the Firebase platform
implementation platform('com.google.firebase:firebase-bom:29.3.1')
Declare the dependency for the Cloud Firestore library
When using the BoM, you don't specify versions in Firebase library dependencies
implementation 'com.google.firebase:firebase-firestore-ktx'
implementation 'com.google.firebase:firebase-analytics-ktx'
Declare the dependency for the Firebase Authentication library
When using the BoM, you don't specify versions in Firebase library dependencies
implementation 'com.google.firebase:firebase-auth-ktx'
Declare the dependency for the Cloud Storage library
When using the BoM, you don't specify versions in Firebase library dependencies
implementation 'com.google.firebase:firebase-storage-ktx'
Glide
implementation 'com.github.bumptech.glide:glide:4.13.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.13.0'
What I have learned         : To create an Android E-Commerce Application from scratch using
Google Firebase - Firestore
Firebase basics, AND how to upload and download data to and from the
online database, etc.
To Build MY own cloud apps with cloud storage, like Whatsapp, Instagram, or Tinder
To Build an application with Cloud Database Firebase
To build different Firebase modules, such as authentication, cloud storage, database
