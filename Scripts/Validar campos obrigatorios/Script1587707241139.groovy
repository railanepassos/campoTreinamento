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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger

'Esse caso de teste valida campos obrigatórios ao preencher formularios'



'Abrir o navegador e navegar até url'
WebUI.openBrowser(GlobalVariable.url)

'Aciona o botão Cadastrar'
WebUI.click(findTestObject('Button/button_Cadastrar'))

'Armazena valor de alerta de preenchimento do campo obrigatório quando for exibido '
alertText = WebUI.getAlertText()

'Verifica se texto está correto ou não'
alertText = WebUI.verifyMatch(alertText, 'Nome eh obrigatorio', false)

'Aceitar alerta quando exibido'
WebUI.acceptAlert()


'Preenche campo nome'
WebUI.setText(findTestObject('Input/input_nome'), GlobalVariable.nome)

'Aciona o botão Cadastrar'
WebUI.click(findTestObject('Button/button_Cadastrar'))

'Armazena valor de alerta de preenchimento do campo obrigatório quando for exibido '
alertText = WebUI.getAlertText()

'Verifica se texto está correto ou não'
WebUI.verifyMatch(alertText, 'Sobrenome eh obrigatorio', false)

'Aceitar alerta quando exibido'
WebUI.acceptAlert()

WebUI.delay(3)

'Preenche campo nome'
WebUI.setText(findTestObject('Input/input_Nome'), GlobalVariable.nome)

'Preenche campo sobrenome'
WebUI.setText(findTestObject('Input/input_Sobrenome'), GlobalVariable.sobrenome)

'Aciona o botão Cadastrar'
WebUI.click(findTestObject('Button/button_Cadastrar'))

'Armazena valor de alerta de preenchimento do campo obrigatório quando for exibido '
alertText = WebUI.getAlertText()

'Verifica se texto está correto ou não'
WebUI.verifyMatch(alertText, 'Sexo eh obrigatorio', false)

'Aceitar alerta quando exibido'
WebUI.acceptAlert()

WebUI.delay(3)

'Preenche campo nome'
WebUI.setText(findTestObject('Input/input_Nome'), GlobalVariable.nome)

'Preenche campo sobrenome'
WebUI.setText(findTestObject('Input/input_Sobrenome'), GlobalVariable.sobrenome)

'Seleciona campo sexo/Feminino'
WebUI.click(findTestObject('Radio/radio_Feminino'))

'Aciona o botão Cadastrar'
WebUI.click(findTestObject('Button/button_Cadastrar'))



