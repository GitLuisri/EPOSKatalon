import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tools.manulife.com/id/epos/uat/login')

WebUI.setText(findTestObject('Object Repository/Page_Log in/input_Username (alamat email)_email'), 'luisri_luisri@manulife.com')

WebUI.click(findTestObject('Object Repository/Page_Log in/label_Kata sandi'))

WebUI.setText(findTestObject('Object Repository/Page_Log in/input_Kata sandi_password'), 'M@nul1fe01!')

WebUI.click(findTestObject('Object Repository/Page_Log in/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/h2_Selamat Datang'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/i_keyboard_arrow_right'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Daftar Nasabah_btn-add-customer btn-_25db75'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ePoS Indonesia/h1_Profil Nasabah'), 30)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_Gelar      Gelar'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/span_Bapak'))

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Gelar_firstName'), 'TEsting')

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Nama Depan_middleName'), 'TestMid')

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Nama Tengah_lastName'), 'TestBack')

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/span_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/span_Perempuan'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/input__dob'))

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input__dob'), '07-Feb-1980')

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/input_ddmmyyyy_mat-input-1'))

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_ddmmyyyy_mat-input-1'), 'Administrasi')

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Pekerjaan_phoneNumber'), '8123213123')

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_ie 81290901212_email'), 'asd@asdsad.com')

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/span_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Daftar Nasabah_mat-input-15'), 'Testing')

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_Buat Proposal'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_Buat Aplikasi_icon__img'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/img'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_MiSmart Insurance Solution'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/span_Buat Proposal'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_0'))

WebUI.sendKeys(findTestObject(null), '10000000000')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/div_Manulife Dana Ekuitas                100'), 10)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_Manulife Dana Ekuitas                100'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_100'))

WebUI.sendKeys(findTestObject(null), '100')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/div_Selanjutnya'), 10)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/div_Selanjutnya'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_ePoS Indonesia/button_Setuju2'), 30)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Setuju2'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/img_Pengaturan Plan_clean-button__icon'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Simpan'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/img_Simpan_clean-button__icon'))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/button_View Final Proposal'), 30)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_View Final Proposal'))

WebUI.click(findTestObject('Page_ePoS Indonesia/button_Mulai Kuisioner - Hal Tabel'))

WebUI.click(findTestObject('Page_ePoS Indonesia/button_Mulai Kuisioner'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ1'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ2'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ3'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ4'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ5'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ6'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ7'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_SAQ8'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Tidak_question91'), '1')

WebUI.setText(findTestObject('Object Repository/Page_ePoS Indonesia/input_Pensiun_questionSA10'), 'Test Abc')

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Lihat hasilnya'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Selesai'))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/button_Mulai Kuisioner_1'), 30)

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Mulai Kuisioner_1'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ1'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ2'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ3'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ4'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ5'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ6'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ7'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ8'))

WebUI.click(findTestObject('Page_ePoS Indonesia/div_NeedQ9'))

WebUI.click(findTestObject('Object Repository/Page_ePoS Indonesia/button_Lihat hasilnya'))

WebUI.click(findTestObject('Page_ePoS Indonesia/button_Selesai2'))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/button_Selesai3'), 30)

WebUI.click(findTestObject('Page_ePoS Indonesia/button_Selesai3'))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/button_OK_Selesai'), 30)

WebUI.click(findTestObject('Page_ePoS Indonesia/button_OK_Selesai'))

WebUI.waitForElementClickable(findTestObject('Page_ePoS Indonesia/button_Buat_Aplikasi'), 30)

WebUI.click(findTestObject('Page_ePoS Indonesia/button_Buat_Aplikasi'))

WebUI.delay(15)

WebUI.closeBrowser()

