Feature: Chuyen doi nhiet do tu C sang F va nguoc lai
  Scenario Outline: Chuyen doi nhiet do tu F sang C
    Given a caculator
    And user input F <inputF>
    When user click button F=>C
    Then result F is <FtoC>
    Examples:
      | inputF | FtoC    |
      | 3.445  | -15.863 |
      | -10.56 | -23.644 |
      | 0      | -17.777 |
      | 100    | 37.777  |

  Scenario Outline: Chuyen doi nhiet do tu C sang F
    Given a caculator
    And user input C <inputC>
    When user click button C=>F
    Then result C is <CtoF>
    Examples:
      | inputC | CtoF   |
      | 3.445  | 38.201 |
      | -10.56 | 12.992 |
      | 0      | 32     |
      | 100    | 212    |