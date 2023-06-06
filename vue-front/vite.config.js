import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [vue()],
    resolve: {
        alias: {
            '@': fileURLToPath(new URL('./src',
                import.meta.url))
        }
    },
    server: {
        open: true, // 设置服务启动时是否自动打开浏览器
        cors: true, // 允许跨域
        host: true,
        // 设置代理，根据我们项目实际情况配置
        proxy: {
            '/api': { //api是自行设置的请求前缀，按照这个来匹配请求，有这个字段的请求，就会进到代理来
                target: 'http://localhost:8081/',
                changeOrigin: true, //是否跨域
                rewrite: (path) => path.replace('/api', '')
            }
        }
    }
})