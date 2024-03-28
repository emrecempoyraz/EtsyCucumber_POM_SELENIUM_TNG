package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Locators {

    public Locators() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")
    public WebElement signInButton;

    @FindBy( id="join_neu_email_field")
    public WebElement mailTextBox;

    @FindBy( id="join_neu_password_field")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    public WebElement signIn;

    @FindBy(xpath = "(//*[contains(text(),'Mary')])[1]")
    public WebElement verifyText;

    @FindBy(id="aria-join_neu_password_field-error")
    public WebElement failmessage;

    @FindBy(id="global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath="//div[@class='wt-bg-white wt-display-block wt-pb-xs-2 wt-mt-xs-0']//h3")
    public List<WebElement> searchResult;

    @FindBy(xpath = "(//div[@class='wt-mb-xs-2'])[1]")
    public WebElement productText;

    @FindBy(id="sortby")
    public WebElement sortBy;

    @FindBy(xpath = "//div[@role='menu']//a")
    public List<WebElement> sortMenu;

    @FindBy(xpath = "//span[@class='currency-value']")
    public List<WebElement> sortingResultList;

    @FindBy(id="catnav-primary-link-10855")
    public WebElement mainMenu;

    @FindBy (id="side-nav-category-link-10865")
    public WebElement subMenu;

    @FindBy (xpath="//div[@class='wt-pb-xs-3 wt-pl-xs-0 wt-mb-xs-3 wt-pr-xs-0 wt-grid']//li//a")
    public List<WebElement> subCategories;

    @FindBy (xpath = "(//ul[@class='wt-grid wt-grid--block wt-pl-xs-0 tab-reorder-container']/li)[1]")
    public WebElement firstItemListed;

    @FindBy(xpath = "//button[@class='wt-btn wt-btn--filled wt-width-full']")
    public WebElement addToCartButton;

    @FindBy(xpath="//h1[@class='wt-text-body-03 wt-line-height-tight wt-break-word']")
    public WebElement productProperties;

    @FindBy(xpath = "(//h1[@class='wt-text-heading-01'])[1]")
    public WebElement title;

    @FindBy(xpath = "//ul[@role='menubar']//li")
    public List<WebElement> menu;

    @FindBy(id="locale-overlay-select-region_code")
    public WebElement region;

    @FindBy(id="locale-overlay-select-language_code")
    public WebElement language;

    @FindBy(id="locale-overlay-select-currency_code")
    public WebElement currency;

    @FindBy(xpath = "(//button[@name='save'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[@class='currency-symbol'])[1]")
    public WebElement currencySymbol;

    // @FindBy(xpath = "//span[@class='wt-tooltip wt-tooltip--disabled-touch']/span")
    @FindBy (xpath = "(//span[@class='etsy-icon'])[14]")
    public WebElement favoritesButton;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement createCollection;

    @FindBy(xpath = "(//input[@id='create-list-title'])[2]")
    public WebElement collectionName;

    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement collectionOK;

    @FindBy(xpath ="//p[@class='wt-text-caption-title wt-text-truncate--multi-line wt-break-word tab-title']")
    public List<WebElement> collectionList;

    @FindBy(xpath="(//span[@class='etsy-icon'])[8]")
    public WebElement editButton;

    @FindBy(xpath = "(//button[@type='button'])[17]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//img[@class='wt-circle wt-icon'])[1]")
    public WebElement profile1;

    @FindBy(xpath = "(//img[@class='wt-circle wt-icon'])[2]")
    public WebElement profile2;

    @FindBy(xpath ="(//p[@class='wt-text-caption-title wt-text-truncate--multi-line wt-break-word tab-title'])[3]")
    public WebElement collectionItem;

    @FindBy(xpath = "(//button[@class='wt-btn wt-btn--filled'])[3]")
    public WebElement deleteAccept;

    @FindBy(xpath = "(//div[@class='wt-ml-xs-2 wt-flex-grow-xs-1'])[5]")
    public WebElement signOut;
}
