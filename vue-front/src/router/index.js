import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
    history: createWebHistory(
        import.meta.env.BASE_URL),
    routes: [{
            path: '/',
            name: 'home',
            component: HomeView
        },
        {
            // 其他路由配置项...
            // 下面添加DocView.vue的路由
            path: '/showDoc',
            name: 'doc',
            component: () =>
                import ('../views/DocView.vue')
        }

    ]
})

export default router