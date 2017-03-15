package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by gmurphy on 3/8/2017.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().selectContact("8");
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
