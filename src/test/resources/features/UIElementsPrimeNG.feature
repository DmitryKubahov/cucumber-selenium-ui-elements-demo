Feature: Show field's model in complex UI testing

  Scenario: Goes to PrimeNG sign-in block and fill data
    Given User enters credentials
      | element     | value                    |
      | Email       | my.real.email@google.com |
      | Password    | really_secret            |
      | Remember me | yes                      |
      | Pause       | 5                        |
      | SignIn      |                          |
