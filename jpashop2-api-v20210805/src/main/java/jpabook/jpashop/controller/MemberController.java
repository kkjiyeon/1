package jpabook.jpashop.controller;


public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members/new")
    public String createForm(Model model) {

    }

    @PostMapping("/members/new")
    public String create(@Valid MemberForm form, BindingResult result) {


    }

    @GetMapping("/members")
    public String list(Model model) {

    }

}
