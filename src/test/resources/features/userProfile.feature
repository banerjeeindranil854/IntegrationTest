Feature: calling the userProfile back end in the liberty project
  this is to demonstrate the integration which and execute any api

  Background:
    Given : when the processor layer is up

  Scenario: calling the demo endpoint
    Given loading the swagger Ui
    When click on the try button
    Then verify the output