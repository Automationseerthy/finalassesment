<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <parameter name="browser" value= "chrome" />
  <parameter name="url" value="https://login.salesforce.com/"></parameter>
    <classes>
      <class name="com.leaftaps.testcases.AssessmentSFIndividuals"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
