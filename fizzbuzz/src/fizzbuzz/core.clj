(ns fizzbuzz.core
  (:gen-class))

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
