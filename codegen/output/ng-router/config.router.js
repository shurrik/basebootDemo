}).state('app.admin.glasslist', {
    url: "/glasslist",
    templateUrl: "assets/views/biz/admin/glass/list.html",
    resolve: loadSequence('ngTable', 'glassCtrl'),
    title: '书籍',
    ncyBreadcrumb: {
        label: '书籍'
    }
