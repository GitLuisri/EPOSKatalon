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

WebUI.verifyElementClickable(findTestObject('Page_ePoS Indonesia/button_Mulai Kuisioner_1'))

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

