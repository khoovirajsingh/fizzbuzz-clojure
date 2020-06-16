(ns fizzbuzz.core
  (:gen-class))

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn number-to-string [number]
  (cond
    (divisible-by? 15 number) "FizzBuzz"
    (divisible-by? 5 number) "Buzz"
    (divisible-by? 3 number) "Fizz"
    :else (str number)))

(defn fizz-buzz-until [max]
  (map number-to-string (range 1 max)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
