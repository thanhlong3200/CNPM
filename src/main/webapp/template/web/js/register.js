$().ready(function () {
        $("#registry").validate({
            rules: {
                fullname: {
                    required: true,
                    minlength: 6,
                    maxlength: 50
                },             
                username: {
                    required: true,
                    minlength: 6,
                    maxlength: 50
                },
                password: {
                    required: true,
                    minlength: 6,
                    maxlength: 30
                },
                confirmPassword: {
                    required: true,
                    equalTo: "#password"
                },
                email: {
                    email: true,
                    required: true,
                    maxlength: 60
                },
                phone: {
                    required: true,
                    maxlength: 11
                },
                address: {
                    required: true
                },
                gender: {
                    required: true
                }
             
            },
            messages: {
                fullname: {
                    required: "Vui lòng điền họ tên",
                    minlength: "Họ tên quá ngắn",
                    maxlength: "Tên tài khoản quá dài"
                },
                username: {
                    required: "Vui lòng điền tên tài khoản",
                    minlength: "Tên tài khoản quá ngắn",
                    maxlength: "Tên tài khoản quá dài"
                },
                password: {
                    required: "Vui lòng điền mật khẩu",
                    minlength: "Mật khẩu quá ngắn",
                    maxlength: "Mật khẩu quá dài"
                },
                confirmPassword: {
                    required: "Vui lòng xác nhận mật khẩu",
                    equalTo: "Mật khẩu không trùng khớp"
                },
                email: {
                    required: "Vui lòng điền địa chỉ email",
                    email: "Địa chỉ email không hợp lệ",
                    maxlength: "Email quá dài"
                },
                phone: {
                    required: "Vui lòng điền email",
                    maxlength: "Số điện thoại quá dài"
                },
                address: {
                    required: "Vui lòng điền địa chỉ"
                },
                gender: {
                    required: "Vui lòng chọn giới tính"
                }
            }
        });
    })