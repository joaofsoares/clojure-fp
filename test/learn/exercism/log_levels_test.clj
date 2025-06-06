(ns learn.exercism.log-levels-test
  (:require [clojure.test :refer [testing deftest is]]
            [learn.exercism.log-levels :refer [message log-level reformat]]))

(deftest message-test
  (testing "message"
    (is (= "Take it slow" (message "[INFO]: Take it slow")))
    (is (= "Go and see for yourself" (message "[WARNING]: Go and see for yourself")))
    (is (= "It's a trap!" (message "[ERROR]:  It's a trap!")))))

(deftest log-level-test
  (testing "log-level"
    (is (= "info" (log-level "[INFO]: Take it slow")))
    (is (= "warning" (log-level "[WARNING]: Go and see for yourself")))
    (is (= "error" (log-level "[ERROR]:  It's a trap!")))))

(deftest reformat-test
  (testing "reformat"
    (is (= "Take it slow (info)" (reformat "[INFO]: Take it slow")))
    (is (= "Go and see for yourself (warning)" (reformat "[WARNING]: Go and see for yourself")))
    (is (= "It's a trap! (error)" (reformat "[ERROR]:  It's a trap!")))
    (is (= "Corrupt disk (error)" (reformat "[ERROR]: \t Corrupt disk\t \t \r\n")))))
