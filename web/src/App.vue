<template>
  <a-layout>
    <!--头部组件-->
    <TheHeader></TheHeader>
    <a-layout-content style="padding: 0 50px">
      <a-layout style="padding: 24px 0; background: #fff">
        <TheSider></TheSider>
        <!--    路由组件-->
        <router-view/>
      </a-layout>
    </a-layout-content>
    <!--    底部组件-->
    <TheFooter></TheFooter>
  </a-layout>
</template>
<script lang="ts">
import {LaptopOutlined, NotificationOutlined, UserOutlined} from '@ant-design/icons-vue';
import {defineComponent, onMounted, ref} from 'vue';
import TheHeader from '@/components/TheHeader.vue';
import TheFooter from '@/components/TheFooter.vue';
import TheSider from '@/components/TheSider.vue';
import https from '@/api/https.js'

export default defineComponent({
  components: {
    UserOutlined,
    LaptopOutlined,
    NotificationOutlined,
    TheHeader,
    TheFooter,
    TheSider,
  },
  setup() {
    onMounted(() => {
      https.fetchGet('/ebook/list', {name: ''}).then((res) => {
        console.log(res)
      }).catch(err => {
            console.log(err)
          }
      );
    })
    // https.fetchPost('/xxx/xxx',this.form).then((res) => {
    //   console.log(res)
    // }).catch(err=>{
    //       console.log(err)
    //     }
    // )

    return {
      selectedKeys1: ref<string[]>(['2']),
      selectedKeys2: ref<string[]>(['1']),
      openKeys: ref<string[]>(['sub1']),
    };
  },
});
</script>
<style>
#components-layout-demo-top-side .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
