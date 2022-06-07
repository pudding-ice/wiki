import {createRouter, createWebHashHistory, RouteRecordRaw} from 'vue-router'
import HomeView from '../views/EbookView.vue'
import AboutView from '../views/AboutView.vue'
import adminEbook from '../views/admin/admin-ebook.vue'


const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    component: AboutView
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    // component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/adminEbook',
    name: 'adminEbook',
    component: adminEbook
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
