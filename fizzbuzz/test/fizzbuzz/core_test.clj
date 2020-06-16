(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest divisible-by
  (is (= true (divisible-by? 3 3)))
  (is (= true (divisible-by? 5 10))))

