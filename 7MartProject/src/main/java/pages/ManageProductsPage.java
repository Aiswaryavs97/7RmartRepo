package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageProductsPage {
	
WebDriver driver;
	
	public ManageProductsPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement product;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
	@FindBy(xpath="//input[@id='title']")private WebElement inputtitle;
	
	@FindBy(xpath="//input[@value='Nonveg']")private WebElement radiononveg;
	@FindBy(xpath="//select[@id='grp_id']")private WebElement group;
	@FindBy(xpath="id=\'purpose\'")private WebElement pricetyperadiobutton;
	@FindBy(xpath="//input[@id='m_weight']")private WebElement weightvalue;
	@FindBy(xpath="//select[@id='w_unit']")private WebElement weightunitdropdown;
	
	@FindBy(xpath="//input[@id='max_weight']")private WebElement maximumquantity;
	@FindBy(xpath="//input[@id='w_price']")private WebElement pricefield;
	@FindBy(xpath="//input[@id='w_mrp']")private WebElement mrpofprice;
	@FindBy(xpath="//input[@id='w_stock']")private WebElement stockavailability;
	
	@FindBy(xpath="//input[@name='unlimitw[]']")private WebElement checkbox;
	
	
	@FindBy(xpath="//div[@class='note-editable card-block']")private WebElement descriptionfield; 
	
	//rafio button
	@FindBy(xpath="//input[@name='main_img']")private WebElement mainimahe;
	
	@FindBy(xpath="//input[@name='subfile[]']")private WebElement subimage;
	
	@FindBy(xpath="//div[@class='note-editable card-block']")private WebElement combopackradiobutton;
	
	@FindBy(xpath="//button[@class='btn btn-danger\"]")private WebElement savebutton;
	
	
	public void clickOnAddProduct() 
	{
		product.click();
	}
	public void  clickOnNewButton() 
	{
		newbutton.click();
	}
	public void inputTiltle(String title)
	{
		inputtitle.sendKeys(title);
	}
	public void clickOnRadioButton1() 
	{
		radiononveg.click();
	}
	public void selectGroupDrowpDown() 
	{
		Select selectdropwdown= new Select(group);
		selectdropwdown.selectByIndex(1);
		
	}
	public void clickPriceType()
	{
		pricetyperadiobutton.click();
	}
	public void addWeightValue(String weightvalue1)
	{
		weightvalue.sendKeys(weightvalue1);
	}
	public void chooseWeightUnit()
	{
		Select choosevalue = new Select(weightunitdropdown);
		choosevalue.selectByIndex(1);
	}
	public void maximumOrder(String ordervalue) 
	{
		maximumquantity.sendKeys(ordervalue);
	}
	public void selectPrice(String pricevalue )
	{
		pricefield.sendKeys(pricevalue);
	}
	public void stock(String stock1)
	{
		stockavailability.sendKeys(stock1);
	}
	public void checkbox()
	{
		checkbox.click();
	}
	public void addDescription(String description) 
	{
		descriptionfield.sendKeys(description);
	}
	public void uploadImage1()
	{
		
	}
}
