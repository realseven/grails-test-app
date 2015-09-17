*** Settings ***
Library           Selenium2Library

*** Variables ***
${BROWSER}        firefox
${URL}            http://google.com
${TITLE}          Google
${KEY}            Ruckus Wireless
${RESULT_TITLE}    Search Result

*** Test Cases ***
Open browser to google index
    Open Browser    ${URL}    ${BROWSER}
    Title Should Be    ${TITLE}

Input search key and submit
    Input Text    xpath=//input[@id='lst-ib']    ${KEY}
    Click Button    xpath=//input[@type='submit']
    Sleep    5

Check result visible and log result
    Element Should Be Visible    xpath=//div[@id='slim_appbar']
    Element Should Be Visible    xpath=//div[@id='resultStats']
    ${result}    Get Text    xpath=//div[@id='resultStats']
    Log    ${result}

Clear environment
    Close Browser
