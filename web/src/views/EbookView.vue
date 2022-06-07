<template>
  <a-layout-content style="padding: 0 50px">
    <a-layout style="padding: 24px 0; background: #fff">
      <TheSider></TheSider>
      <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
        <a-list :data-source="ebooks" :pagination="pagination" grid="{ gutter: 50, column: 3 }" item-layout="vertical"
                size="large">
          <template #renderItem="{ item }">
            <a-list-item key="item.title">
              <template #actions>
          <span v-for="{ type, text } in actions" :key="type">
            <component :is="type" style="margin-right: 8px"/>
            {{ text }}
          </span>
              </template>
              <a-list-item-meta :description="item.description">
                <template #title>
                  <a :href="item.href">{{ item.name }}</a>
                </template>
                <template #avatar>
                  <a-avatar :src="item.cover"/>
                </template>
              </a-list-item-meta>
            </a-list-item>
          </template>
        </a-list>
      </a-layout-content>
    </a-layout>
      </a-layout-content>
</template>

<script lang="ts">
import {LikeOutlined, MessageOutlined, StarOutlined} from '@ant-design/icons-vue';
import {defineComponent, onMounted, ref} from 'vue';
import request from '@/api/axiosRequest.js';
import TheSider from '@/components/TheSider.vue';


export default defineComponent({
  components: {
    StarOutlined,
    LikeOutlined,
    MessageOutlined,
    TheSider
  },
  setup() {
    const ebooks = ref()

    onMounted(() => {
      const queryText = ''
      request.fetchGet('/ebook/list', {name: queryText}).then((res) => {
        ebooks.value = res.data.content;
      })
    })

    const actions: Record<string, string>[] = [
      {type: 'StarOutlined', text: '156'},
      {type: 'LikeOutlined', text: '156'},
      {type: 'MessageOutlined', text: '2'},
    ];
    return {
      ebooks,
      actions,
    };
  },
});
</script>



