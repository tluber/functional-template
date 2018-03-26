(ns exercise10)

(defn summary [x]
  (reduce + x)
)

(defn faverage [x]
  (def suma (summary x))
  (def cant (count x))
  (/ suma cant)
)

(defn fvariance [x]
  (def esperanza (faverage x))
  (def sub (map (fn [y] (- y esperanza)) x))
  (def sq (map (fn [z] (* z z)) sub))
  (def sumsq (summary sq))
  
  (/ sumsq (count x))
)
