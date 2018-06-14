(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0)  "fizz"
    (= (mod n 5) 0)  "buzz"
    :else            ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (coll? x)   (cond
                  (empty? x) nil
                  (or (list? x) (vector? x)) (* (count x) 2)
                  :else true)
    :else       true))

(defn leap-year? [year]
  (and (or (= (mod year 400) 0)
           (not (= (mod year 100) 0)))
       (= (mod year 4) 0)))

; '_______'
