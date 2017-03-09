package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by gmurphy on 3/8/2017.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().selectContact("8");
    app.getContactHelper().deleteContact();
  }
}
