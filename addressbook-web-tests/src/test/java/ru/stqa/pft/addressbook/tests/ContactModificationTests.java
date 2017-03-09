package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by gmurphy on 3/8/2017.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().selectContact("8");
    app.getContactHelper().editContact();
  }
}
