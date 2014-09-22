package com.web;

import com.hibernate.objects.Member;

/**
 *
 * @author chelsea
 */
public class MemberService {
    
    public Member addNewMember (Integer id, String firstName, String lastName, String email) {
        return new Member();
    }
    
    public Member getMember (Integer id) {
        return new Member();
    }
    
    public Member getMemberByEmail (String email) {
        return new Member();
    }
    
    public void updateMember (Integer id, String firstName, String lastName, String email) {
        
    }
    
    public void removeMember (Integer id) {

    }
}
