(ns fizzbuzz.core
  (:gen-class))

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn number-to-string [number]
  (cond
    (divisible-by? 3 number) "Fizz"
    :else (str number)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
