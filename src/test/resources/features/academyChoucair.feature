# Author: JassonCastellanosGonzález
  @stories
  Feature: Join user at uTest.com
    I want to create a profile at uTest.com by joining online
  @scenario1
  Scenario:Create a new profile
    Given than Carlos needs a profile on uTest.com
    | strNameUser        | strLastNaUser   | strEmailAddr        | strMonth  | strDay  | strYear | strLanguage | strPassword             |
    | Carlos             | Bustamante      | cbusta@test.com     |  October  |  20     |  1990   |  Spanish    |  ContraTest12           |

    When he is on the login page at uTest.com
    | strEmailAddr                   |  strPassword             |
    | cbusta@test.com                |  ContraTest12            |

    Then he finds the screen with a message:
    | strConfirmation            |
    | Resend Confirmation Email  |



