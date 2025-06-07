(ns learn.exercism.two-fer-test
  (:require [clojure.test :refer [testing deftest is]]
            [learn.exercism.two-fer :refer [two-fer]]))

(deftest two-fer_test_1
  (testing "no name given"
    (is (= "One for you, one for me." (two-fer)))))

(deftest two-fer_test_2
  (testing "a name given"
    (is (= "One for Alice, one for me." (two-fer "Alice")))))

(deftest two-fer_test_3
  (testing "another name given"
    (is (= "One for Bob, one for me." (two-fer "Bob")))))
