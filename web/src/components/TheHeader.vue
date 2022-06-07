<template>
  <a-layout-header class="header">
    <div class="logo"/>
    <a-menu
        v-model:selectedKeys="selectedKeys1"
        :style="{ lineHeight: '64px' }"
        mode="horizontal"
        theme="dark"
    >
      <a-menu-item key="1">
        <router-link to="/">首页</router-link>
      </a-menu-item>
      <a-menu-item key="2">
        <router-link to="/">电子书管理</router-link>
      </a-menu-item>
      <a-menu-item key="3">
        <router-link to="/about">关于我们</router-link>
      </a-menu-item>
    </a-menu>
  </a-layout-header>
</template>
