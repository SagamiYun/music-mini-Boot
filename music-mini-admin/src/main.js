import { createApp } from 'vue'
import App from './App.vue'

// Import icon libraries
import '@quasar/extras/material-icons/material-icons.css'

// Import Quasar css
import 'quasar/src/css/index.sass'
import { Quasar } from 'quasar'


const myApp = createApp(App)
myApp.use(Quasar, {
    plugins: {}, // import Quasar plugins and add here
})

myApp.mount('#app')