var myapp=angular.module("myModule1",[])
                  .controller("mycontroller1",function ($scope,$http,$log) {

                      $scope.message="Change entirely";
                        $scope.add=function()
                        {
                            var data=$scope.fields;
                            console.log(data);
                            var data1=JSON.stringify(data);
                            console.log(data1);
                            $http.post("http://localhost:9090/addStudent",data)
                                .then(function (response) {
                                    $scope.students=response.data;
                                    $scope.status=response.status;
                                });
                        };
                        $scope.search=function () {
                            var id=$scope.id;
                            var url="http://localhost:9090/student/"+id;
                            $http.get(url).then(function (response) {
                               $scope.studentresult=response.data;
                            },function(reason){
                                $scope.errorstatus=reason.data;
                                $log.info(reason);
                            })
                        }
                  });