# -*- coding: utf-8 -*


'''
Created on 2014年2月10日

@author: doujianbo
'''
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
import unittest, time, re

class Untitled(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://10.65.46.160/user/logout"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_untitled2(self):
        driver = self.driver
        driver.get(self.base_url + "/user/logout")
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("user")
        driver.find_element_by_id("password").send_keys("nsfocus")
        driver.find_element_by_name("login").click()
        driver.find_element_by_xpath("//input[@value='取消']").click()
        driver.find_element_by_css_selector("em").click()
        driver.implicitly_wait(30)               #做一个等待加载frame
        driver.switch_to_frame("mainframe");  #进入login的iframe框
        driver.find_element_by_xpath["//input[@value='下一步']"].click();
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException, e: return False
        return True
    

    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()

