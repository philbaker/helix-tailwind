(ns app.counter
  (:require [helix.core :refer [defnc $ <>]]
            [helix.dom :as d]
            [helix.hooks :as hooks]))
            
(defnc counter []
  (let [[state set-state] (hooks/use-state 0)]
    (d/div {:className "mt-6 px-6 flex"} 
           (d/button {:className "p-2 bg-blue-200"
                      :on-click #(set-state dec)} "-")
           (d/span {:className "p-2 bg-blue-100"} state)
           (d/button {:className "p-2 bg-blue-200" 
                      :on-click #(set-state inc)} "+"))))
