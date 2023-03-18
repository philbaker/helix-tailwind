(ns app.core
  (:require [helix.core :refer [defnc $ <>]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]))

(defnc header []
  (d/div {:class "px-6"}
     (d/h1 {:class "text-2xl mt-6"} 
           "Helix + Tailwind starter")))

(defnc counter []
  (let [[state set-state] (hooks/use-state 0)]
    (d/div {:class "mt-6 px-6 flex"} 
           (d/button {:class "p-2 bg-blue-200"
                      :on-click #(set-state dec)} "-")
           (d/span {:class "p-2 bg-blue-100"} state)
           (d/button {:class "p-2 bg-blue-200" 
                      :on-click #(set-state inc)} "+"))))

(defnc app []
  (<>
    ($ header)
    ($ counter)))

(defonce root (rdom/createRoot (js/document.getElementById "app")))
(defn ^:dev/after-load start
  []
  (.render root ($ app)))

(defn ^:export main
  []
  (start))
