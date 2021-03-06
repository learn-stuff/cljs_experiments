(ns experiment.core
  (:require [experiment.utils :as utils]
            [t]))

(defn adder-multiplier
  [x y z]
  (* z (utils/adder x y)))

(adder-multiplier 2 3 4)

(defn render
  []
  (.render (js/treeact)))
(render)

(enable-console-print!)

(println "This text is printed from src/experiment/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
