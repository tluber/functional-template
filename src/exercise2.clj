(ns exercise2)

(defn only-greater-than-five [x]
	(def greater-than-five (fn [x] (< 5 x)))
	(filter greater-than-five x)
)




