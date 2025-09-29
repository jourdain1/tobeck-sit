// Konfigirasyon Firebase (ranplase ak pwòp konfigirasyon ou)
const firebaseConfig = {
    apiKey: "API_KEY_LA",
    authDomain: "PROJECT_ID.firebaseapp.com",
    projectId: "PROJECT_ID",
    storageBucket: "PROJECT_ID.appspot.com",
    messagingSenderId: "SENDER_ID",
    appId: "APP_ID"
};

// Inisyalize Firebase
firebase.initializeApp(firebaseConfig);
const storage = firebase.storage();
