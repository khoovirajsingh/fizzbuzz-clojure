(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest divisible-by
  (is (= true (divisible-by? 3 3)))
  (is (= true (divisible-by? 5 10))))

(deftest number-1-is-converted-to-string-1
  (is (= "1" (number-to-string 1))))

(deftest number-3-is-converted-to-string-Fizz
  (is (= "Fizz" (number-to-string 3))))
