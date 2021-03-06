
(ns app.schema )

(def box-name "submit-box")

(def configs {:storage-key "workflow-storage", :port 11006})

(def database {:sessions {}, :users {}, :count 0, :snippets {}})

(def dev? (do ^boolean js/goog.DEBUG))

(def notification {:id nil, :kind nil, :text nil})

(def router {:name nil, :title nil, :data {}, :router nil})

(def session
  {:user-id nil,
   :id nil,
   :nickname nil,
   :router {:name :home, :data nil, :router nil},
   :notifications [],
   :show-all? false})

(def snippet {:id nil, :content "", :time 0, :author-id nil})

(def user {:name nil, :id nil, :nickname nil, :avatar nil, :password nil})
