(ns exercise6)


(defn summary [x]
  (reduce + x)
)

(defn faverage [x]
  (def suma (summary x))
  (def cant (count x))
  (/ suma cant)
)

