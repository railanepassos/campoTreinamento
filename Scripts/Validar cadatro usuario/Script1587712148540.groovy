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


'Esse caso valida se com o preenchimento de campos obrigatórios o cadastro é concluido.'


WebUI.callTestCase(findTestCase('Validar campos obrigatorios'), ['p_Protocol' : null, 'p_DomainName' : null, 'p_Path' : null, 'p_WindowTitle' : null])

'Verificar se mensagem de sucesso no cadatsro é exibida'
WebUI.verifyElementVisible(findTestObject('Span/span_Cadastrado'))

'Validar informações em campos preenchidos'
WebUI.verifyElementText(findTestObject('Span/span_Nome'), GlobalVariable.nome)
WebUI.verifyElementText(findTestObject('Span/span_Sobrenome'), GlobalVariable.sobrenome)
WebUI.verifyElementText(findTestObject('Span/span_Sexo'), 'Feminino')
WebUI.verifyElementText(findTestObject('Span/span_Escolaridade'), '1grauincomp')
WebUI.verifyElementText(findTestObject('Span/span_Esportes'), '')
WebUI.verifyElementText(findTestObject('Span/span_Sugestoes'), '')


