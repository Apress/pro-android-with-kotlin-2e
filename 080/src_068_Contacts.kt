val intent = Intent(Intents.Insert.ACTION)
intent.setType(ContactsContract.RawContacts.CONTENT_TYPE)
intent.putExtra(Intents.Insert.EMAIL, emailAddress)
      .putExtra(Intents.Insert.EMAIL_TYPE, 
          CommonDataKinds.Email.TYPE_WORK)
      .putExtra(Intents.Insert.PHONE, phoneNumber)
      .putExtra(Intents.Insert.PHONE_TYPE, 
          Phone.TYPE_WORK)
startActivity(intent)
