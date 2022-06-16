Feature: nap tien, rut tien va chuyen khoan
Scenario: Nap them tien thanh cong
  Given Khoi tao tai khoan A so du la 0
  When Nap 1000
  Then So du tai khoan sau khi nap la 1000

  Scenario: So tien tieu it hon so du
    Given Khoi tao tai khoan A so du la 1000
    When tru tien 500
    Then So du tai khoan sau khi nap la 500

#    Scenario: So tien tieu nhieu hon so du
#      Given Khoi tao tai khoan A so du la 1000
#      When tru tien 1200
#      Then nem ra exception "RuntimeException"
#      And noi dung la "Amount exceeded balance"

      Scenario: Chuyen tien thanh cong
        Given Khoi tao tai khoan A so du la 1000
        And Khoi tao tai khoan B co so du la 0
        When Chuyen so tien 200 tu tai khoan A den tai khoan B
        Then So du tai khoan A sau khi chuyen la 800
        And So du tai khoan B sau khi chuyen la 200

#        Scenario: Chuyen tien khong thanh cong
#          Given Khoi tao tai khoan A so du la 1000
#          And Khoi tao tai khoan B co so du la 0
#          When Chuyen so tien 1200 tu tai khoan A den tai khoan B
#          Then nem ra exception "RuntimeException"
#          And noi dung la "Amount exceeded balance"