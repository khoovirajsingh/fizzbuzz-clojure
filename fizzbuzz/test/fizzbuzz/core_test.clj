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

(deftest number-5-is-converted-to-string-Buzz
  (is (= "Buzz" (number-to-string 5))))

(deftest number-15-is-converted-to-string-FizzBuzz
  (is (= "FizzBuzz" (number-to-string 15))))

(deftest range-of-numbers-are-mapped-to-string
  (is (= '("1" "2" "Fizz" "4" "Buzz" "Fizz" "7" "8" "Fizz") (fizz-buzz-until 10))))

(deftest newline-is-added-between-list-of-strings
  (is (= "1\n2\nFizz" (format '("1" "2" "Fizz")))))
  
