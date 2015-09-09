(defproject crispin "0.3.0-SNAPSHOT"
  :description "A library for managing project-wide configuration."
  :url "https://github.com/dunaj-project/crispin"
  :license {:name "Eclipse Public License"
            :distribution :repo
            :comments "same as Clojure"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git" :url "https://github.com/dunaj-project/crispin"}
  :signing {:gpg-key "6A72CBE2"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :dependencies [[cheshire "5.5.0"]
                 [org.clojure/clojure "1.7.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0"]]}})
