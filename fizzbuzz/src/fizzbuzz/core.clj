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

(defn format [strings]
  (clojure.string/join "\n" strings))


(defn -main
  "Display FizzBuzz sequence."
  [& args]
  (println (format (fizz-buzz-until 100))))
