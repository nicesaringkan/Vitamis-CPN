import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

//row = 28

String closeC =' '

xlsData = findTestData('mockup_tanent')

for (int row = 1; row <= xlsData.getRowNumbers(); row++) {
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://surveyconduct.feedback180.com/dz55a39?round=6')

WebUI.click(findTestObject('btn_start'))

'B2_1 ภูมิภาค'
WebUI.waitForElementVisible(findTestObject('dropdown_region'), GlobalVariable.time)

WebUI.selectOptionByLabel(findTestObject('dropdown_region'), xlsData.getValue('B2_1', row), true)

'B2_2 สาขา'
WebUI.waitForElementVisible(findTestObject('dropdown_branch'), GlobalVariable.time)

WebUI.selectOptionByLabel(findTestObject('dropdown_branch'), xlsData.getValue('B2_2', row), true)

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'T2 กรุณาระบุประเภทร้านค้าของคุณ'
WebUI.click(findTestObject('radio_age', [('age') : xlsData.getValue('T2', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'T2-1 กรุณาระบุชื่อร้านค้าของคุณ'
WebUI.setText(findTestObject('text_area1', [('rowNo') : '1']), xlsData.getValue('T2-1', row))

'T3 กรุณาระบุขนาดร้านค้าของคุณ'
WebUI.click(findTestObject('radio_age', [('age') : xlsData.getValue('T3', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'S1 ความพึงพอใจโดยรวมในการดำเนินธุรกิจกับศูนย์การค้าแห่งนี้?'
WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('S1', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'S2 กรุณาเลือกเจ้าหน้าที่ของศูนย์การค้าที่คุณติดต่อประสานงานด้วยล่าสุด?'
WebUI.click(findTestObject('radio_age', [('age') : xlsData.getValue('S2', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'สำหรับเจ้าหน้าที่ศูนย์การค้าในข้างต้นคุณมีความพึงพอใจต่อการให้บริการในด้านต่อไปนี้ระดับใด?'

'S3_1 ความง่ายในการติดต่อเจ้าหน้าที่'
WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_1', row)]))

'S3_2 มารยาทและอัธยาศัยของเจ้าหน้าที่'
WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_2', row)]))

'S3_3 การประสานงานที่สะดวกรวดเร็ว ถูกต้อง มีการติดตามและตอบกลับ แจ้งผล'
WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_3', row)]))

'S3_4 ประสิทธิภาพในการปฎิบัติงานและความรวดเร็วในการแก้ไขปัญหา'
WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('S3_4', row)]))

'S3_5 การให้ข้อมูล/ ข่าวสารที่เป็นประโยชน์ต่อร้านค้าให้รับทราบอย่างชัดเจนและสม่ำเสมอ'
WebUI.click(findTestObject('vote_score', [('rowNo') : '5', ('vote') : xlsData.getValue('S3_5', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'อีเว้นท์และโปรโมชั่นส่งเสริมการขาย'

'S4_1 มีการจัดโปรโมชั่นที่น่าสนใจส่งผลดีต่อยอดขายและตรงต่อความต้องการของกลุ่มเป้าหมายเช่น ชิงโชค/ ของสมนาคุณ'
WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('S4_1', row)]))

'S4_2 อีเว้นท์ที่จัดขึ้นภายในศูนย์การค้าดึงดูดใจลูกค้ากลุ่มเป้าหมายและมีความแปลกใหม่ เช่นงานเปิดตัวสินค้า, คอนเสิร์ต, นิทรรศการ'
WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('S4_2', row)]))

'S4_3 ความถี่ที่เหมาะสมในการจัดโปรโมชั่นภายในศูนย์การค้าเช่น ชิงโชค/ของสมนาคุณ'
WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('S4_3', row)]))

'S4_4 ความถี่ที่เหมาะสมในการจัดอีเว้นท์ภายในศูนย์การค้าเช่น งานเปิดตัวสินค้า, คอนเสิร์ต,นิทรรศการ'
closeC = xlsData.getValue('S4_4',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('S4_4', row)]))

'S4_5 ความแปลกใหม่และความสวยงามของการตกแต่งและบรรยากาศของอีเว้นท์'
WebUI.click(findTestObject('vote_score', [('rowNo') : '5', ('vote') : xlsData.getValue('S4_5', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'S4-1 คุณเคยใช้ลานจอดรถสำหรับผู้เช่าร้านค้าของศูนย์การค้าหรือไม่?'
WebUI.click(findTestObject('radio_age', [('age') : xlsData.getValue('S4-1', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

if (xlsData.getValue('S4-1', row).equalsIgnoreCase('1')) {
    'S4_6 ความเพียงพอของที่จอดรถสำหรับผู้เช่าร้านค้า'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('S4_6', row)]))

    'S4_7 ความพร้อมของสถานที่จอดรถเช่น ความสะอาด หลังคา'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('S4_7', row)]))

    'S4_8 ความสะดวกในการเดินทางมาศูนย์การค้าด้วยรถสาธารณะเช่น รถเมล์, รถไฟฟ้า, รถไฟฟ้าใต้ดิน,(เส้นทางหรือความถี่และจำนวนของรถ)'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('S4_8', row)]))

    'S4_9 ความปลอดภัยของที่จอดรถ เช่นแสงสว่างในที่จอดรถ รปภ. ประจำจุดปุ่มกดเพื่อขอความช่วยเหลือฉุกเฉิน'
    WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('S4_9', row)]))

    WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

    WebUI.click(findTestObject('btn_next'))
}

'สภาพแวดล้อมบริเวณหน้าร้านค้าและภายในศูนย์การค้า'

'S4_11 สภาพการตกแต่งศูนย์การค้าทั้งภายนอกและภายใน'
WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('S4_11', row)]))

'S4_12 แสงสว่าง'
closeC = xlsData.getValue('S4_12',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('S4_12', row)]))

'S4_13 ความเหมาะสมของอุณหภูมิ'
WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('S4_13', row)]))

'S4_14 กลิ่น'
WebUI.click(findTestObject('vote_score', [('rowNo') : '4', ('vote') : xlsData.getValue('S4_14', row)]))

'S4_15.1 ความสะอาดของพื้นที่ส่วนกลาง'
WebUI.click(findTestObject('vote_score', [('rowNo') : '5', ('vote') : xlsData.getValue('S4_15.1', row)]))

'S4_15.2 เสียงดนตรีสร้างบรรยากาศภายในศูนย์การค้า /เสียงรบกวนที่ส่งผลกระทบต่อการค้าขาย'
WebUI.click(findTestObject('vote_score', [('rowNo') : '6', ('vote') : xlsData.getValue('S4_15.2', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'การบริหารจัดการศูนย์การค้า'

'S4_16 การจัดการแมลงและหนู'
WebUI.click(findTestObject('vote_score', [('rowNo') : '1', ('vote') : xlsData.getValue('S4_16', row)]))

'S4_17 การป้องกันและรับมือภัยธรรมชาติ / อัคคีภัย'
WebUI.click(findTestObject('vote_score', [('rowNo') : '2', ('vote') : xlsData.getValue('S4_17', row)]))

'S4_18 ระบบ/ อุปกรณ์รักษาความปลอดภัยมีมาตรฐานและเพียงพอต่อความต้องการ'
WebUI.click(findTestObject('vote_score', [('rowNo') : '3', ('vote') : xlsData.getValue('S4_18', row)]))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

'S5 ข้อเสนอแนะหรือคำติชมเพื่อปรับปรุงและพัฒนาการดำเนินงานของศูนย์การค้าในอนาคต'
WebUI.setText(findTestObject('text_area2'), xlsData.getValue('S5', row))

WebUI.waitForElementVisible(findTestObject('btn_next'), GlobalVariable.time)

WebUI.click(findTestObject('btn_next'))

WebUI.delay(3)

WebUI.closeBrowser()

}