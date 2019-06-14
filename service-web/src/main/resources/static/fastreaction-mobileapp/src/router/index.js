import Vue from 'vue'
import Router from 'vue-router'

import Email from '../components/email/FREmailView.vue'
import Contacts from '../components/contacts/FRContactsView'
import Person from '../components/mine/FRPersonView'





Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '',
      redirect: '/login'
    },


    {path: '/email', component : Email},
    {path: '/contacts', component : Contacts},
    {path: '/person', component : Person}
  ],
  linkActiveClass : 'mui-active' // 覆盖默认的路由高亮的类，默认的类叫做router-link-active
})
