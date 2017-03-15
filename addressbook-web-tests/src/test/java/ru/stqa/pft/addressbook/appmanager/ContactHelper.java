package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by gmurphy on 3/8/2017.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void selectContact(String id) {
    selectCheckbox(id);
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void editContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("contact_firstName"), contactData.getFirstName());
    type(By.name("contact_lastName"), contactData.getLastName());
    type(By.name("contact_nickname"), contactData.getNickname());
    type(By.name("contact_company"), contactData.getCompany());
    type(By.name("contact_address"), contactData.getAddress());
    type(By.name("contact_home"), contactData.getHome());
    type(By.name("contact_mobile"), contactData.getMobile());
    type(By.name("contact_work"), contactData.getWork());
    type(By.name("contact_email"), contactData.getEmail());
  }


  public void submitContactModification() {
    click(By.name("update"));
  }

  public void returnToHomePage() {
    click(By.name("home page"));
  }
}