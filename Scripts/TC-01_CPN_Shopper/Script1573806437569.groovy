import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.TakesScreenshot

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//row = 5

String closeC =' '

xlsData = findTestData('Data_CPN_Shopper')

checkBox = findTestObject('Object Repository/checkbox')

for (int row = 1; row <= xlsData.getRowNumbers(); row++) {
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://surveyconduct.feedback180.com/w6w4ie6?round=6')

WebUI.waitForPageLoad(GlobalVariable.time)

WebUI.click(findTestObject('btn_start'))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'S1 อายุ'
WebUI.click(findTestObject('radio_age', [('age') : xlsData.getValue('S1', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

if (xlsData.getValue('S1', row).equalsIgnoreCase('1')) {
	WebUI.delay(1)
    WebUI.closeBrowser() 
	
	// xpath = //div[@class="sub_question"][${rowNo}]//div[${vote}]
    //rowNo คือเลขข้อที่ เช่น ต้องการข้อ1 rowNo = 1+1 คือ 2 ส่วน vote คือคะแนนที่จะโหวต เช่นเดียวกันกับกรณี rowNo
} else {
    ansVote = Integer.valueOf(xlsData.getValue('B1_1', row))

    ansVote = (ansVote + 1)

    'B1_1 ภาพลักษณ์และชื่อเสียงของศูนย์การค้า'
    WebUI.click(findTestObject('radio_vote', [('rowNo') : '2', ('vote') : ansVote]))

    ansVote = Integer.valueOf(xlsData.getValue('B1_2', row))

    ansVote = (ansVote + 1)

    'B1_2 ความสะดวกในการเดินทางมาศูนย์การค้า'
    WebUI.click(findTestObject('radio_vote', [('rowNo') : '3', ('vote') : ansVote]))

    ansVote = Integer.valueOf(xlsData.getValue('B1_3', row))

    ansVote = (ansVote + 1)

    'B1_3 ประเภทและแบรนด์ร้านค้า'
    WebUI.click(findTestObject('radio_vote', [('rowNo') : '4', ('vote') : ansVote]))

    ansVote = Integer.valueOf(xlsData.getValue('B1_4', row))

    ansVote = (ansVote + 1)

    'B1_4 อีเว้นท์และโปรโมชั่น'
    WebUI.click(findTestObject('radio_vote', [('rowNo') : '5', ('vote') : ansVote]))

    ansVote = Integer.valueOf(xlsData.getValue('B1_5', row))

    ansVote = (ansVote + 1)

    'B1_5 การบริการและสิ่งอำนวยความสะดวก'
    WebUI.click(findTestObject('radio_vote', [('rowNo') : '6', ('vote') : ansVote]))

    ansVote = Integer.valueOf(xlsData.getValue('B1_6', row))

    ansVote = (ansVote + 1)

    'B1_6 บรรยากาศ/การตกแต่งศูนย์การค้า'
    WebUI.click(findTestObject('radio_vote', [('rowNo') : '7', ('vote') : ansVote]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B2_1 ภูมิภาค'
    WebUI.selectOptionByLabel(findTestObject('dropdown_region'), xlsData.getValue('B2_1', row), true)

    'B2_2 สาขา'
    WebUI.selectOptionByLabel(findTestObject('dropdown_branch'), xlsData.getValue('B2_2', row), true)

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B3 ความพึงพอใจโดยรวมต่อศูนย์การค้าแห่งนี้?'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B3', row)]))

    'B4 ความเป็นไปได้ที่คุณจะแนะนำให้ผู้อื่นมาใช้บริการศูนย์การค้าแห่งนี้?'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('B4', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B5_1 เป็นศูนย์การค้าที่น่าไว้วางใจและน่าเชื่อถือ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B5_1', row)]))

    'B5_2 เป็นศูนย์การค้าที่มีความแตกต่างไม่เหมือนใคร'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('B5_2', row)]))

    'B5_3 เป็นศูนย์การค้าที่ตอบโจทย์ไลฟ์สไตล์และการใช้ชีวิตของคุณ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('B5_3', row)]))

    'B5_4 เป็นศูนย์การค้าที่ได้รับความนิยม'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('B5_4', row)]))

    'B5_5 เป็นศูนย์การค้าที่ทันสมัย'
	closeC = xlsData.getValue('B5_5',  row)
	if(closeC == 'close') {
	  WebUI.closeBrowser()
	  closeC =''
	  continue
	}
    WebUI.click(findTestObject('vote_score', [('rowNo') : '5', ('vote') : xlsData.getValue('B5_5', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B6_1 เดินทางมาศูนย์การค้าสะดวก'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B6_1', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B6_2 จัดโซนร้านค้าเป็นหมวดหมู่ เดินง่าย'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B6_2', row)]))

    'B6_3 ประเภทร้านค้าหลากหลาย'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('B6_3', row)]))

    'B6_4 ร้านค้าโดดเด่น ทันสมัย ไม่ซ้ำใคร'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('B6_4', row)]))

    'B6_5 มีแบรนด์ร้านอาหารให้เลือกตามต้องการ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('B6_5', row)]))
	
	'Scroll down'
	WebUI.scrollToElement(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('B6_5', row)]), 3)
	
    if (Integer.valueOf(xlsData.getValue('B6_5', row)) < 3) {
        'B7_1 กรุณาระบุแบรนด์ร้านอาหารที่คุณต้องการให้มี ในศูนย์การค้าแห่งนี้'
			
        WebUI.setText(findTestObject('text_area1', [('rowNo') : '1']), xlsData.getValue('B7_1', row))
    }
    
    'B6_6 มีแบรนด์ร้านแฟชั่นให้เลือกตามต้องการ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '5', ('vote') : xlsData.getValue('B6_6', row)]))

    if (Integer.valueOf(xlsData.getValue('B6_6', row)) < 3) {
        'B7_2 กรุณาระบุแบรนด์ร้านแฟชั่นที่คุณต้องการให้มี ในศูนย์การค้าแห่งนี้'

		
		if (Integer.valueOf(xlsData.getValue('B6_5', row)) < 3) {
			WebUI.setText(findTestObject('text_area1', [('rowNo') : '2']), xlsData.getValue('B7_2', row))
		} 
		else {
			WebUI.setText(findTestObject('text_area1', [('rowNo') : '1']), xlsData.getValue('B7_2', row))
		}
        
    }
    
    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B6_7 การประชาสัมพันธ์อีเว้นท์และโปรโมชั่นที่ชัดเจนเข้าใจง่ายและเพียงพอ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B6_7', row)]))

    'B6_8 อีเว้นท์ที่ดึงดูดใจ แปลกใหม่ สวยงาม'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('B6_8', row)]))

    'B6_9 โปรโมชั่นที่ดึงดูดใจ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('B6_9', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B6_10 การบริการของเจ้าหน้าที่ศูนย์การค้าในโซนพลาซา (ไม่รวมพนักงานร้านค้าและในห้างสรรพสินค้า) ที่มีมาตรฐานและเป็นมืออาชีพ'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B6_10', row)]))

    'B6_11 อุปกรณ์และสิ่งอำนวยความสะดวกที่ครบครันและได้มาตรฐาน'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('B6_11', row)]))

    'B6_12 ระบบรักษาความปลอดภัยที่มีมาตรฐาน'
	closeC = xlsData.getValue('B6_12',  row)
	if(closeC == 'close') {
	  WebUI.closeBrowser()
	  closeC =''
	  continue
	}
    WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('B6_12', row)]))

    'B6_13 สิ่งอำนวยความสะดวกที่ตรงกับความต้องการเช่น สำหรับ เด็ก ผู้สูงอายุ ผู้พิการ สัตว์เลี้ยง'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('B6_13', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'B6_14 บรรยากาศการตกแต่งที่สวยงาม'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('B6_14', row)]))

    'B6_15 ความสะอาดและความเป็นระเบียบเรียบร้อย'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('B6_15', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'O1 กรุณาระบุเรื่องที่คุณไม่พึงพอใจในโซนพลาซาของศูนย์การค้าแห่งนี้?'
    CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O1', row))

    'อื่นๆ'
    if (xlsData.getValue('O1', row).reverse().take(2).reverse() == 'ON') {
        WebUI.setText(findTestObject('Object Repository/test_other'), xlsData.getValue('OtherO1', row))
    }
    
    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
	TakesScreenshot
    WebUI.click(findTestObject('btn_next'))
	
	'แยก Condition ข้อ O'
	String [] extract1 = xlsData.getValue('O1', row).split(",");
	
    if (extract1[1] == "ON") {
        'O2 คุณพบปัญหาจากสิ่งอำนวยความสะดวกใด'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O2', row))
		
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
		
        WebUI.click(findTestObject('btn_next'))

		
		'แยก Condition ข้อ O2'
		String [] extract2 = xlsData.getValue('O2', row).split(",");
		
		if (extract2[0] == "ON") {		
        'O2_C1 คุณพบปัญหาอะไรในที่จอดรถ?'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O2_C1', row))
		WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))
		}

		if (extract2[1] == "ON") {			
        'O2_C2 คุณพบปัญหาอะไรในห้องน้ำ?'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O2_C2', row))
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))
		}
		
		if (extract2[2] == "ON") {
        'O2_C3 คุณพบปัญหาอะไรในพื้นที่ส่วนกลาง/จุดนั่งพักและทำงาน?'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O2_C3', row))
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))
		}

		if (extract2[3] == "ON") {
        'O2_C4 คุณพบปัญหาอะไรกับป้ายบอกทาง/ไดเร็คทอรี่?'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O2_C4', row))
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))
		}
	}
	
    if (extract1[2] == "ON") {
        'O3 คุณพบปัญหาจากเจ้าหน้าที่ศูนย์การค้าในโซนพลาซาฝ่ายใด?'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O3', row))
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))

        'O3_C1 คุณพบปัญหาจากเจ้าหน้าที่ศูนย์การค้าในด้านใด?'	
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O3_1', row))
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))
	}
	
    if (extract1[3] == "ON"){
        'O4 คุณพบปัญหาอะไรกับบรรยากาศภายในศูนย์การค้า?'
		CustomKeywords.'com.fb180.utilities.MyUtilities.myCheckbox1'(checkBox, xlsData.getValue('O4', row))
        WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)
        WebUI.click(findTestObject('btn_next'))
   
	}    
    'S5 ข้อเสนอแนะหรือคำติชมเพื่อปรับปรุงและพัฒนาการดำเนินงานของศูนย์การค้าในอนาคต'
    WebUI.setText(findTestObject('text_area2'), xlsData.getValue('S5', row))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))

    'P1 ชื่อ﻿'
    WebUI.setText(findTestObject('text_area3', [('text') : '1']), xlsData.getValue('P1_1', row))

    'P1 นามสกุล'
    WebUI.setText(findTestObject('text_area3', [('text') : '2']), xlsData.getValue('P1_2', row))

    'P2 เลขบัตรประชาชน'
    WebUI.setText(findTestObject('text_area3', [('text') : '3']), xlsData.getValue('P2', row))

    'P3 เพศ'
    WebUI.click(findTestObject('radio_sex', [('sex') : xlsData.getValue('P3', row)]))

    'P4 รายได้ครัวเรือนเฉลี่ยต่อเดือน'
    WebUI.click(findTestObject('radio_salary', [('salary') : xlsData.getValue('P4', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))
	
	WebUI.delay(5)
	
    WebUI.closeBrowser()
}

}